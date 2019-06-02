# Test launches our end-to-end integration testing for each client library. 
test:
	@### Boot the sidecar API to capture API requests.
	@make docker

	@### JavaScript browser
	@# TODO

	@### TypeScript browser
	@# TODO

	@### JavaScript node
	@make test-javascript-node	

	@### TypeScript node
	@# TODO

test-javascript-node:
	@echo "\n>>>	🏃 Running JavaScript Node client test suite...\n"
	@yarn run -s dev --config=./tests/e2e/javascript-node
	@cd tests/e2e/javascript-node && \
		yarn && \
		yarn run -s test

docker:
	@docker-compose -f tests/e2e/docker-compose.yml up -d
	@# Make sure the snapshotter is available and all messages have been cleared from any previous tests:
	@sleep 3
	@curl -f "http://localhost:8765/messages" > /dev/null 2>&1

teardown:
	@docker-compose -f tests/e2e/docker-compose.yml down

# Update updates all e2e tests to use the latest "Typewriter E2E Tracking Plan"
update:
	@yarn dev --config=tests/e2e/javascript-node update