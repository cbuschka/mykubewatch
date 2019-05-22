# My implementation of a kubernetes event watcher in Java

## Usage
(This is just a POC, but...)
* adjust [mykubewatch-all.yaml](./mykubewatch-all.yaml) to your needs (security role!)
* then deploy via
```bash
kubectl apply -f mykubewatch-all.yaml
```

## Docker Image
[cbuschka/mykubewatch](https://hub.docker.com/r/cbuschka/mykubewatch)

## License

MIT
