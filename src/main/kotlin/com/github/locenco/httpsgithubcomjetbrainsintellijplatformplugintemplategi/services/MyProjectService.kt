package com.github.locenco.httpsgithubcomjetbrainsintellijplatformplugintemplategi.services

import com.intellij.openapi.project.Project
import com.github.locenco.httpsgithubcomjetbrainsintellijplatformplugintemplategi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
