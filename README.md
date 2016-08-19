# s3-emrfs-test
This is a simple app to smoke-test usage of Amazon S3 while running on an Amazon EMR cluster, via its EMRFS file system.

## Getting Started
* Install Leiningen http://leiningen.org
* `lein uberjar`
* Run the jar on an EMR cluster with `hadoop s3-emrfs-test-0.1.0-SNAPSHOT-standalone.jar s3://[input-bucket]/[path] s3://[output-bucket]/[path]`

`s3-emrfs-test` will print lines from `s3://[input-bucket]/[path]` to stdout, and also sink lines into `s3://[output-bucket]/[path]`. 

## Why?
I needed a crazy-stupid-simple example app to run in EMR, given the difficulty of testing with a REPL or other means in that system. This helped me debug another application; hope it's useful to yours!