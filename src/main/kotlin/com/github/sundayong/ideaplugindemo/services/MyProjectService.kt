package com.github.sundayong.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.sundayong.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
