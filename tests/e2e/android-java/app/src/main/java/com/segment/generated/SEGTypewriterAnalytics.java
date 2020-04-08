/**
* This client was automatically generated by Segment Typewriter. ** Do Not Edit **
*/
package com.segment.generated;

import com.segment.analytics.Analytics;
import com.segment.analytics.Options;
import com.segment.analytics.Properties;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SEGTypewriterAnalytics {
  public Analytics analytics;

  public SEGTypewriterAnalytics(final @NonNull Analytics analytics) {
    this.analytics = analytics;
  }

  // Validates that clients properly sanitize event names.
  public void I42TerribleEventName3() {
    this.analytics.track("42_--terrible==\\\"event'++name~!3", new Properties());
  };

  // Validates that clients properly sanitize event names.
  public void I42TerribleEventName3(final @Nullable Options options) {
    this.analytics.track("42_--terrible==\\\"event'++name~!3", new Properties(), options);
  };

  // Fired before an analytics instance has been set, which should throw an error.
  public void analyticsInstanceMissing() {
    this.analytics.track("Analytics Instance Missing", new Properties());
  };

  // Fired before an analytics instance has been set, which should throw an error.
  public void analyticsInstanceMissing(final @Nullable Options options) {
    this.analytics.track("Analytics Instance Missing", new Properties(), options);
  };

  // Fired after a client throws an "Analytics Instance Missing" error to mark the
  // test as successful.
  public void analyticsInstanceMissingThrewError() {
    this.analytics.track("Analytics Instance Missing Threw Error", new Properties());
  };

  // Fired after a client throws an "Analytics Instance Missing" error to mark the
  // test as successful.
  public void analyticsInstanceMissingThrewError(final @Nullable Options options) {
    this.analytics.track("Analytics Instance Missing Threw Error", new Properties(), options);
  };

  // This event is fired in order to trigger a custom violation handler. It should
  // be called with a JSON Schema violation.
  public void customViolationHandler(final @Nullable CustomViolationHandler props) {
    this.analytics.track("Custom Violation Handler", props.toProperties());
  };

  // This event is fired in order to trigger a custom violation handler. It should
  // be called with a JSON Schema violation.
  public void customViolationHandler(final @Nullable CustomViolationHandler props, final @Nullable Options options) {
    this.analytics.track("Custom Violation Handler", props.toProperties(), options);
  };

  // This event should be fired if a custom violation handler is correctly called
  // due to a call to `Custom Violation Handler` with a violation.
  public void customViolationHandlerCalled() {
    this.analytics.track("Custom Violation Handler Called", new Properties());
  };

  // This event should be fired if a custom violation handler is correctly called
  // due to a call to `Custom Violation Handler` with a violation.
  public void customViolationHandlerCalled(final @Nullable Options options) {
    this.analytics.track("Custom Violation Handler Called", new Properties(), options);
  };

  // This event is fired in order to trigger the default violation handler. It
  // should be called with a JSON Schema violation.
  public void defaultViolationHandler(final @Nullable DefaultViolationHandler props) {
    this.analytics.track("Default Violation Handler", props.toProperties());
  };

  // This event is fired in order to trigger the default violation handler. It
  // should be called with a JSON Schema violation.
  public void defaultViolationHandler(final @Nullable DefaultViolationHandler props, final @Nullable Options options) {
    this.analytics.track("Default Violation Handler", props.toProperties(), options);
  };

  // This event should be fired if the default violation handler is correctly
  // called due to a call to `Default Violation Handler` with a violation.
  public void defaultViolationHandlerCalled() {
    this.analytics.track("Default Violation Handler Called", new Properties());
  };

  // This event should be fired if the default violation handler is correctly
  // called due to a call to `Default Violation Handler` with a violation.
  public void defaultViolationHandlerCalled(final @Nullable Options options) {
    this.analytics.track("Default Violation Handler Called", new Properties(), options);
  };

  // Validates that a generated client supports events with no explicit
  // properties. It is expected that this event accepts ANY properties.
  public void emptyEvent() {
    this.analytics.track("Empty Event", new Properties());
  };

  // Validates that a generated client supports events with no explicit
  // properties. It is expected that this event accepts ANY properties.
  public void emptyEvent(final @Nullable Options options) {
    this.analytics.track("Empty Event", new Properties(), options);
  };

  // Validates that a generated client handles even naming collisions.
  public void eventCollided() {
    this.analytics.track("Event Collided", new Properties());
  };

  // Validates that a generated client handles even naming collisions.
  public void eventCollided(final @Nullable Options options) {
    this.analytics.track("Event Collided", new Properties(), options);
  };

  // Validates that clients handle all of the supported field types, as nullable
  // optional fields. If a field is null, it is expected to be NOT sent through.
  public void everyNullableOptionalType(final @Nullable EveryNullableOptionalType props) {
    this.analytics.track("Every Nullable Optional Type", props.toProperties());
  };

  // Validates that clients handle all of the supported field types, as nullable
  // optional fields. If a field is null, it is expected to be NOT sent through.
  public void everyNullableOptionalType(final @Nullable EveryNullableOptionalType props,
      final @Nullable Options options) {
    this.analytics.track("Every Nullable Optional Type", props.toProperties(), options);
  };

  // Validates that clients handle all of the supported field types, as nullable
  // required fields. If a field is null, it is expected to be sent through.
  public void everyNullableRequiredType(final @Nullable EveryNullableRequiredType props) {
    this.analytics.track("Every Nullable Required Type", props.toProperties());
  };

  // Validates that clients handle all of the supported field types, as nullable
  // required fields. If a field is null, it is expected to be sent through.
  public void everyNullableRequiredType(final @Nullable EveryNullableRequiredType props,
      final @Nullable Options options) {
    this.analytics.track("Every Nullable Required Type", props.toProperties(), options);
  };

  // Validates that clients handle all of the supported field types, as optional
  // fields.
  public void everyOptionalType(final @Nullable EveryOptionalType props) {
    this.analytics.track("Every Optional Type", props.toProperties());
  };

  // Validates that clients handle all of the supported field types, as optional
  // fields.
  public void everyOptionalType(final @Nullable EveryOptionalType props, final @Nullable Options options) {
    this.analytics.track("Every Optional Type", props.toProperties(), options);
  };

  // Validates that clients handle all of the supported field types, as required
  // fields.
  public void everyRequiredType(final @Nullable EveryRequiredType props) {
    Log.i("props", props.toProperties().toString());
    this.analytics.track("Every Required Type", props.toProperties());
  };

  // Validates that clients handle all of the supported field types, as required
  // fields.
  public void everyRequiredType(final @Nullable EveryRequiredType props, final @Nullable Options options) {
    this.analytics.track("Every Required Type", props.toProperties(), options);
  };

  // Validates that clients correctly serialize large numbers (integers and
  // floats).
  public void largeNumbersEvent(final @Nullable LargeNumbersEvent props) {
    this.analytics.track("Large Numbers Event", props.toProperties());
  };

  // Validates that clients correctly serialize large numbers (integers and
  // floats).
  public void largeNumbersEvent(final @Nullable LargeNumbersEvent props, final @Nullable Options options) {
    this.analytics.track("Large Numbers Event", props.toProperties(), options);
  };

  // Validates that clients handle arrays-within-arrays.
  public void nestedArrays(final @Nullable NestedArrays props) {
    Log.i("nested", props.toProperties().toString());
    this.analytics.track("Nested Arrays", props.toProperties());
  };

  // Validates that clients handle arrays-within-arrays.
  public void nestedArrays(final @Nullable NestedArrays props, final @Nullable Options options) {
    this.analytics.track("Nested Arrays", props.toProperties(), options);
  };

  // Validates that clients handle objects-within-objects.
  public void nestedObjects(final @Nullable NestedObjects props) {
    this.analytics.track("Nested Objects", props.toProperties());
  };

  // Validates that clients handle objects-within-objects.
  public void nestedObjects(final @Nullable NestedObjects props, final @Nullable Options options) {
    this.analytics.track("Nested Objects", props.toProperties(), options);
  };

  // Validates that clients handle collisions in property names within a single
  // event.
  public void propertiesCollided(final @Nullable PropertiesCollided props) {
    this.analytics.track("Properties Collided", props.toProperties());
  };

  // Validates that clients handle collisions in property names within a single
  // event.
  public void propertiesCollided(final @Nullable PropertiesCollided props, final @Nullable Options options) {
    this.analytics.track("Properties Collided", props.toProperties(), options);
  };

  // Validates that clients handle collisions in object names across multiple
  // events.
  public void propertyObjectNameCollision1(final @Nullable PropertyObjectNameCollision1 props) {
    this.analytics.track("Property Object Name Collision #1", props.toProperties());
  };

  // Validates that clients handle collisions in object names across multiple
  // events.
  public void propertyObjectNameCollision1(final @Nullable PropertyObjectNameCollision1 props,
      final @Nullable Options options) {
    this.analytics.track("Property Object Name Collision #1", props.toProperties(), options);
  };

  // Validates that clients handle collisions in object names across multiple
  // events.
  public void propertyObjectNameCollision2(final @Nullable PropertyObjectNameCollision2 props) {
    this.analytics.track("Property Object Name Collision #2", props.toProperties());
  };

  // Validates that clients handle collisions in object names across multiple
  // events.
  public void propertyObjectNameCollision2(final @Nullable PropertyObjectNameCollision2 props,
      final @Nullable Options options) {
    this.analytics.track("Property Object Name Collision #2", props.toProperties(), options);
  };

  // Validates that clients sanitize property names that contain invalid
  // identifier characters.
  public void propertySanitized(final @Nullable PropertySanitized props) {
    this.analytics.track("Property Sanitized", props.toProperties());
  };

  // Validates that clients sanitize property names that contain invalid
  // identifier characters.
  public void propertySanitized(final @Nullable PropertySanitized props, final @Nullable Options options) {
    this.analytics.track("Property Sanitized", props.toProperties(), options);
  };

  // Validates that clients support fields with various types of arrays.
  public void simpleArrayTypes(final @Nullable SimpleArrayTypes props) {
    this.analytics.track("Simple Array Types", props.toProperties());
  };

  // Validates that clients support fields with various types of arrays.
  public void simpleArrayTypes(final @Nullable SimpleArrayTypes props, final @Nullable Options options) {
    this.analytics.track("Simple Array Types", props.toProperties(), options);
  };

  // Validates that clients support fields with multiple (union) types.
  public void unionType(final @Nullable UnionType props) {
    this.analytics.track("Union Type", props.toProperties());
  };

  // Validates that clients support fields with multiple (union) types.
  public void unionType(final @Nullable UnionType props, final @Nullable Options options) {
    this.analytics.track("Union Type", props.toProperties(), options);
  };

  // Validates that a generated client handles even naming collisions.
  public void eventCollided1() {
    this.analytics.track("event_collided", new Properties());
  };

  // Validates that a generated client handles even naming collisions.
  public void eventCollided1(final @Nullable Options options) {
    this.analytics.track("event_collided", new Properties(), options);
  };

}