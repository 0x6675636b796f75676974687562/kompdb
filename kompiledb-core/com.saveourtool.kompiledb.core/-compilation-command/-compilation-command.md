---
title: CompilationCommand
---
//[kompiledb-core](../../../index.html)/[com.saveourtool.kompiledb.core](../index.html)/[CompilationCommand](index.html)/[CompilationCommand](-compilation-command.html)



# CompilationCommand



[jvm]\
constructor(directory: [EnvPath](../-env-path/index.html), file: [EnvPath](../-env-path/index.html), arguments: [ParsedArgs](../../com.saveourtool.kompiledb.core.io/index.html#1743527040%2FClasslikes%2F-204370792), output: [EnvPath](../-env-path/index.html)? = null)



#### Throws


| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if file is blank, or arguments are empty. |




[jvm]\
constructor(directory: [EnvPath](../-env-path/index.html), file: [EnvPath](../-env-path/index.html), command: [RawCommandLine](../../com.saveourtool.kompiledb.core.io/index.html#1075615255%2FClasslikes%2F-204370792), output: [EnvPath](../-env-path/index.html)? = null)



#### Throws


| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if either file or command is blank. |




[jvm]\
constructor(directory: [EnvPath](../-env-path/index.html), file: [EnvPath](../-env-path/index.html), arguments: [ParsedArgs](../../com.saveourtool.kompiledb.core.io/index.html#1743527040%2FClasslikes%2F-204370792), command: [RawCommandLine](../../com.saveourtool.kompiledb.core.io/index.html#1075615255%2FClasslikes%2F-204370792)? = null, output: [EnvPath](../-env-path/index.html)? = null)



#### Parameters


jvm

| | |
|---|---|
| directory | the working directory of the compilation. All paths specified in the command or file fields must be either absolute or relative to this directory. |
| file | the main translation unit source processed by this compilation step. This is used by tools as the key into the compilation database. There can be multiple command objects for the same file, for example if the same source file is compiled with different configurations. |
| command | the compile command executed. After JSON unescaping, this must be a valid command to rerun the exact compilation step for the translation unit in the environment the build system uses. Parameters use shell quoting and shell escaping of quotes, with `"` and `\` being the only special characters. Shell expansion is not supported. |
| arguments | the compile command `argv` as list of strings. This should run the compilation step for the translation unit file. `arguments[0]` should be the executable name, such as `clang++`. Arguments should not be escaped, but ready to pass to `execvp()`. |
| output | the name of the output created by this compilation step. This field is optional. It can be used to distinguish different processing modes of the same input file. |



