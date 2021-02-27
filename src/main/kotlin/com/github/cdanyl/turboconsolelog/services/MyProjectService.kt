package com.github.cdanyl.turboconsolelog.services

import com.github.cdanyl.turboconsolelog.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
