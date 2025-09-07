// fileOne.groovy
import groovy.json.JsonOutput

//return a map with setup metadata
def setupEnv(String appName) {
    echo "fileOne: setting up environment for ${appName}"
    def data = [ app: appName, version: "1.0", timestamp: new Date().toString() ]
    return data
}

def call(Map args = [:]) {
    return setupEnv(args.app ?: 'default-app')
}
