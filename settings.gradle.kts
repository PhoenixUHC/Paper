rootProject.name = "paperspigot-parent"

arrayOf("API", "Server").forEach {
    val path = "PaperSpigot-$it"
    val project = path.toLowerCase()

    include(project)
    project(":$project").projectDir = file(path)
}
