#!/bin/bash

# Use GitHub username as unique student identifier
USER_ID="${GITHUB_USER:-unknown}"

# Save logs in workspace folder
LOGDIR="$HOME/workspace/.codespace_logs"
mkdir -p "$LOGDIR"
LOGFILE="$LOGDIR/.codespace_time_${USER_ID}.log"

# Log session start
echo "Session started at $(date '+%Y-%m-%d %H:%M:%S')" >> $LOGFILE

# Log session end automatically
trap 'echo "Session ended at $(date '+%Y-%m-%d %H:%M:%S')" >> $LOGFILE' EXIT