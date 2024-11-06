plugins {
    id("casseroleupdates")
}

// Casserole Config
val casseroleContactPoints = mutableListOf("localhost", "172.16.1.101", "172.10.10.1", "127.0.0.1")
val casseroleFiles = mutableListOf(project.projectDir.toString() + "/cql/helloworld")

casseroleUpdatesConfig {
    contactPoints = casseroleContactPoints
    keyspaceDirectories = casseroleFiles
}

casseroleUpdatesTestingConfig {
    contactPoints = casseroleContactPoints
    keyspaceDirectories = casseroleFiles
    keyspacePrefix = "testing_"
}
