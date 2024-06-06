def buildStatus = currentBuild.result
echoe "Build Status: $buildStatus";
env.BUILD_RESULT = buildStatus
echo "Environment Build Status: ${env.BUILD_RESULT}"
