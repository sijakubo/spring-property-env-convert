package com.github.sijakubo.springpropertyenvconvert.services

import com.github.sijakubo.springpropertyenvconvert.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
