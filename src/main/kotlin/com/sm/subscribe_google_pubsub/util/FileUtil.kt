package com.sm.subscribe_google_pubsub.util

import java.io.*

class FileUtil {

    fun makeFile(resource: String): File? {
        var file: File? = null
        val res = javaClass.getResource(resource)
        if (res.protocol == "jar") {
            try {
                val input: InputStream? = javaClass.getResourceAsStream(resource)
                file = File.createTempFile("tempfile", ".tmp")
                val out: OutputStream = FileOutputStream(file)
                var read: Int?
                val bytes = ByteArray(1024)
                while (input?.read(bytes).also { read = it } != -1) {
                    read?.let { out.write(bytes, 0, it) }
                }
                out.close()
                file.deleteOnExit()
            } catch (ex: IOException) {
            }
        } else {
            file = File(res.file)
        }
        return file
    }

}