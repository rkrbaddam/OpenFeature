# OpenFeature
POC on OpenFeature toggle

Run the flagD provider using below doker command:
docker run --rm -it --name flagd -p 8013:8013 ghcr.io/open-feature/flagd:latest start --uri https://raw.githubusercontent.com/open-feature/flagd/main/samples/example_flags.flagd.json
