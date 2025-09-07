// fileTwo.groovy
// accepts a map (from fileOne) and produces an artifact id (string)
def process(Map setupData) {
    echo "fileTwo: processing app ${setupData.app} version ${setupData.version}"
    // simulate building an artifact id
    def artifact = "${setupData.app}-${setupData.version}-${env.BUILD_NUMBER ?: '1'}"
    echo "fileTwo: artifact -> ${artifact}"
    return artifact
}

def call(Map args = [:]) {
    return process(args.data ?: [:])
}

