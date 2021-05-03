docker build -t flutter:test .
# docker scan --accept-license --dependency-tree --json  flutter:test
docker run --rm -it flutter:test bash