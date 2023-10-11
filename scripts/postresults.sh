#!/bin/bash

echo 'run setup prior to this'
source ./scripts/setup.sh

json="
{\"appLinkName\":\"JenkinsBuildResults2Jira\",
    \"fields\":
       {\"id\":\"$BUILD_TAG\",
        \"title\":\"Build $BUILD_NUMBER completed with status $3\",
        \"status\":\"New\",
        \"priority\":\"major\",
        \"created_by\":\"vijay\",
        \"assigned_to\":\"vijay\",
        \"linked_story_id\":"$5",
        \"created_time\":\"`date`\",
        \"modified_time\":\"`date`\",
        \"BUILD_ID\":\"$BUILD_ID\",
        \"BUILD_DISPLAY_NAME\":\"$BUILD_DISPLAY_NAME\",
        \"JOB_NAME\":\"$JOB_NAME\",
        \"JOB_BASE_NAME\":\"$JOB_BASE_NAME\",
        \"BUILD_TAG\":\"$BUILD_TAG\",
        \"EXECUTOR_NUMBER\":\"$EXECUTOR_NUMBER\",
        \"NODE_NAME\":\"$NODE_NAME\",
        \"NODE_LABELS\":\"$NODE_LABELS\",
        \"JENKINS_URL\":\"$JENKINS_URL\",
        \"BUILD_URL\":\"$BUILD_URL\",
        \"JOB_URL\":\"$JOB_URL\",
        \"GIT_COMMIT\":\"$GIT_COMMIT\",
        \"GIT_PREVIOUS_COMMIT\":\"$GIT_PREVIOUS_COMMIT\",
        \"GIT_PREVIOUS_SUCCESSFUL_COMMIT\":\"$GIT_PREVIOUS_SUCCESSFUL_COMMIT\",
        \"GIT_BRANCH\":\"$GIT_BRANCH\",
        \"GIT_LOCAL_BRANCH\":\"$GIT_LOCAL_BRANCH\",
        \"GIT_URL\":\"$GIT_URL\",
        \"GIT_COMMITTER_NAME\":\"$GIT_COMMITTER_NAME\",
        \"GIT_AUTHOR_NAME\":\"$GIT_AUTHOR_NAME\",
        \"GIT_COMMITTER_EMAIL\":\"$GIT_COMMITTER_EMAIL\",
        \"GIT_AUTHOR_EMAIL\":\"$GIT_AUTHOR_EMAIL\"
        }}"
echo "Send JSON: $json"
echo "via $ConnectAllUrl/api/2/postRecord?apikey=$ConnectAllApikey"
curl \
--header "Content-Type: application/json;charset=UTF-8" -X POST \
-d "$json" \
 $ConnectAllUrl/connectall/api/2/postRecord?apikey=$ConnectAllApiKey