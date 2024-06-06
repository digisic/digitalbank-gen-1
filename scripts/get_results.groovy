def buildStatus = currentBuild.result
env.BUILD_RESULT = buildStatus
echo "Build status: ${env.BUILD_RESULT}"
