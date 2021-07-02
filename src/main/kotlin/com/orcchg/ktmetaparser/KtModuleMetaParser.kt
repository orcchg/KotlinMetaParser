package com.orcchg.ktmetaparser

import java.io.File
import kotlinx.metadata.jvm.KotlinModuleMetadata

class KtModuleMetaParser {
	
	fun parse(filename: String) {
		val bytes = File(filename).readBytes()
		val metadata = KotlinModuleMetadata.read(bytes)
		val module = metadata?.toKmModule()
		val out1 = module?.annotations?.joinToString("\n", transform = { it.className })
		println(out1)
	}
}

fun main(args: Array<String>) {
	val filename = args[0]
    println("Parsing $filename: \n")

	val parser = KtModuleMetaParser()
	parser.parse(filename)
}