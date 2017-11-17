job('Project-JOB-test') {
  scm {
    git('https://github.com/PoojaSinha0309/Seed-plugin-devops.git')
  }
	triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}