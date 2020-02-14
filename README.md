A note about using `@AutoService` along with `ServiceLoader`
------------------------------------------------------

An `@AutoService` annotation helps to register interface implementations in `ServiceLoader`. But it's a third-party annotation written by Google and we have to specify `com.google.auto.service:auto-service:$auto_service_version` dependency to use it. So why vanilla Java's `ServiceLoader` needs a third-party dependency?

A point is that we have not to use `@AutoService` at all, we could do all its work manually. Specifically, we would have to create a file where we would write all implementations of interface to use them later in `ServiceLoader`. But `@AutoService` makes it for us.

Here is what it has done:

```bash
~/autowired-vs-serviceloader$ find . -name "META-INF"
./serviceloader/build/classes/java/main/META-INF

~/autowired-vs-serviceloader$ cd ./serviceloader/build/classes/java/main/META-INF
~/autowired-vs-serviceloader/serviceloader/build/classes/java/main/META-INF$ ls
services

~/autowired-vs-serviceloader/serviceloader/build/classes/java/main/META-INF$ cd services
~/autowired-vs-serviceloader/serviceloader/build/classes/java/main/META-INF/services$ ls
app.services.SimplePrinter

~/autowired-vs-serviceloader/serviceloader/build/classes/java/main/META-INF/services$ cat app.services.SimplePrinter
app.services.SimplePrinterImpl
app.services.SimplePrinterUppercaseImpl
```

Thus, `@AutoService` use is optional, but still handy.
