package com.saveourtool.kompiledb.core.compiler

import com.saveourtool.kompiledb.core.CompilationCommand
import com.saveourtool.kompiledb.core.EnvPath
import com.saveourtool.kompiledb.core.io.ParsedArgs

/**
 * The result of parsing a [CompilationCommand] with a [CompilerCommandParser]
 *
 * @param arguments the compile command `argv` as list of strings, similar to
 *   [CompilationCommand.arguments]. The list may contain additional arguments
 *   as a result of response file expansion.
 * @param errors the list of parse errors encountered, if any.
 * @see CompilationCommand
 * @see CompilerCommandParser.parse
 */
data class ParsedCompilerCommand(
    val compiler: EnvPath,
    val includePaths: Map<String, EnvPath>,
    val definedMacros: Map<String, String>,
    val undefinedMacros: List<String>,
    val arguments: ParsedArgs,
    val ignoredArguments: ParsedArgs,
    val errors: List<String> = emptyList(),
)
