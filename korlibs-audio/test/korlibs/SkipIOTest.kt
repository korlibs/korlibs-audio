import korlibs.platform.*

//val skipIOTest: Boolean get() = Platform.isJs || Platform.isWasm || Platform.isAndroid
val skipIOTest: Boolean get() = Platform.isJs || Platform.isAndroid
//val skipIOTest: Boolean get() = Platform.isAndroid || Platform.isWasm
//val skipIOTest: Boolean get() = OS.isAndroid
val doIOTest: Boolean get() = !skipIOTest
