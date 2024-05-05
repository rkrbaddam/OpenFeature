# OpenFeature
POC on OpenFeature toggle

Providers are an important concept in OpenFeature because they are responsible for the flag evaluation itself. If we want to actually perform feature flagging, we'll need to register a provider
1) Start flagd service with the following docker command which has the flags configuration in https://raw.githubusercontent.com/open-feature/flagd/main/samples/example_flags.flagd.json

docker run --rm -it --name flagd -p 8013:8013 ghcr.io/open-feature/flagd:latest start --uri https://raw.githubusercontent.com/open-feature/flagd/main/samples/example_flags.flagd.json
