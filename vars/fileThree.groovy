// fileThree.groovy
// deploys artifact to target env and returns boolean success
def deploy(String artifact, String targetEnv = 'dev') {
    echo "fileThree: deploying ${artifact} to ${targetEnv}"
    // pretend deploy steps...
    sleep 1
    echo "fileThree: deploy completed for ${artifact}"
    return true
}

def call(Map args = [:]) {
    return deploy(args.artifact ?: 'unknown', args.env ?: 'dev')
}

