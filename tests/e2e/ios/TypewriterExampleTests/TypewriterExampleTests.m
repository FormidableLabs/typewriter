//
//  TypewriterExampleTests.m
//  TypewriterExampleTests
//
//  Created by Colin King on 6/7/19.
//  Copyright © 2019 Segment. All rights reserved.
//

#import <XCTest/XCTest.h>
#import <Analytics/SEGAnalytics.h>
#import <Analytics/SEGSegmentIntegration.h>
#import "SEGTypewriterAnalytics.h"

@interface TypewriterExampleTests : XCTestCase

@end

@implementation TypewriterExampleTests

NSString *const SIDECAR_ADDRESS = @"http://localhost:8765";

- (void)testExample {
    [SEGTypewriterAnalytics emptyEvent];
    
    [SEGTypewriterAnalytics everyRequiredTypeWithRequiredAny:@"Rick Sanchez" requiredArray:@[@137, @"C-137"] requiredBoolean:false requiredInt:97 requiredNumber:@3.14 requiredObject:@{} requiredString:@"Alpha-Betrium" requiredStringWithRegex:@"Lawyer Morty"];
    
    [SEGTypewriterAnalytics everyOptionalTypeWithOptionalAny:nil optionalArray:nil optionalBoolean:nil optionalInt:nil optionalNumber:nil optionalObject:nil optionalString:nil optionalStringWithRegex:nil];
    
    // TODO: pretty sure this is wrong...
    [SEGTypewriterAnalytics everyNullableRequiredTypeWithRequiredAny:nil requiredArray:nil requiredBoolean:nil requiredInt:nil requiredNumber:nil requiredObject:nil requiredString:nil requiredStringWithRegex:nil];
    
    [SEGTypewriterAnalytics everyNullableOptionalTypeWithOptionalAny:nil optionalArray:nil optionalBoolean:nil optionalInt:nil optionalNumber:nil optionalObject:nil optionalString:nil optionalStringWithRegex:nil];
    
    [SEGTypewriterAnalytics I42TerribleEventName3];
    
    [SEGTypewriterAnalytics propertySanitizedWithI0000TerriblePropertyName3:@"what a cronenberg"];
    
    [SEGTypewriterAnalytics eventCollided];
    [SEGTypewriterAnalytics eventCollided1];
    
    [SEGTypewriterAnalytics propertiesCollidedWithPropertyCollided:@"The Citadel" propertyCollided1:@"Galactic Prison"];
    
    SEGUniverse *universe = [SEGUniverse initWithName:@"Froopyland" occupants:@[
                                                        [SEGOccupantsItem initWithName:@"Beth Smith"],
                                                        [SEGOccupantsItem initWithName:@"Thomas Lipkip"]
                                                        ]];
    [SEGTypewriterAnalytics propertyObjectNameCollision1WithUniverse:universe];
    
    SEGUniverse1 *universe2 = [SEGUniverse1 initWithName:@"Froopyland" occupants:@[
                                                                                [SEGOccupantsItem1 initWithName:@"Beth Smith"],
                                                                                [SEGOccupantsItem1 initWithName:@"Thomas Lipkip"]
                                                                                ]];
    [SEGTypewriterAnalytics propertyObjectNameCollision2WithUniverse:universe2];
    
    // TODO: nullable??
    [SEGTypewriterAnalytics simpleArrayTypesWithAny:@[@137, @"C-137"] boolean:@[[NSNumber numberWithBool:TRUE], [NSNumber numberWithBool:FALSE]] integer:@[@97] nullable_:nil number:@[@3.14] object:@[[SEGObjectItem initWithName:@"Beth Smith"]] string:@[@"Alpha-Betrium"]];
    
    SEGSubterraneanLab *lab = [SEGSubterraneanLab initWithJerrysMemories:@[] mortysMemories:@[] summersContingencyPlan:@"Oh, man, it’s a scenario four."];
    SEGTunnel *tunnel = [SEGTunnel initWithSubterraneanLab:lab];
    SEGGarage *garage = [SEGGarage initWithTunnel:tunnel];
    [SEGTypewriterAnalytics nestedObjectsWithGarage:garage];
    
    [SEGTypewriterAnalytics nestedArraysWithUniverseCharacters:@[
                                                                 @[
                                                                     [SEGUniverseCharactersItemItem initWithName:@"Morty Smith"],
                                                                     [SEGUniverseCharactersItemItem initWithName:@"Rick Sanchez"]
                                                                     ],
                                                                 @[
                                                                     [SEGUniverseCharactersItemItem initWithName:@"Cronenberg Morty"],
                                                                     [SEGUniverseCharactersItemItem initWithName:@"Cronenberg Rick"]
                                                                     ]
                                                                 ]];
    
    // Note: flushing is an async operation in analytics-ios. Therefore, we use notifications to
    // identify when all events have finished flushing.
    __block BOOL finish = false;
    [[NSNotificationCenter defaultCenter] addObserverForName:SEGSegmentRequestDidSucceedNotification object:nil queue:nil usingBlock:^(NSNotification *notification) {
        NSLog(@"Typewriter: SEGSegmentRequestDidSucceedNotification notification fired");
        finish = true;
    }];
    // We also want to catch failures, so that our test suite will still finish.
    [[NSNotificationCenter defaultCenter] addObserverForName:SEGSegmentRequestDidFailNotification object:nil queue:nil usingBlock:^(NSNotification *notification) {
        NSLog(@"Typewriter: SEGSegmentRequestDidFailNotification notification fired");
        finish = true;
    }];
    
    [[SEGAnalytics sharedAnalytics] flush];
    
    while(!finish) {
        [[NSRunLoop currentRunLoop] runUntilDate:[NSDate dateWithTimeIntervalSinceNow:0.1]];
    }
}

@end
