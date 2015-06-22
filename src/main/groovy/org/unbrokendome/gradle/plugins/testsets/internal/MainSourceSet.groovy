package org.unbrokendome.gradle.plugins.testsets.internal

import org.gradle.api.Project
import org.gradle.api.tasks.SourceSet

class MainSourceSet {
    static SourceSet get(Project project) {
        project.sourceSets[SourceSet.MAIN_SOURCE_SET_NAME]
    }
}
