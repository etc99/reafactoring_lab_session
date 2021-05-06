#!/bin/bash

set -x

JUNIT_PATH=/usr/share/java/junit4.jar
SCRIPT_DIR=$(dirname "$0")
SRC_DIR="${SCRIPT_DIR}/../src"
OUTPUT_DIR="${SCRIPT_DIR}/../built"

set -e
rm -Rf "${OUTPUT_DIR}"
mkdir -p "${OUTPUT_DIR}"
javac -verbose -g -sourcepath "${SRC_DIR}/lanSimulation" -cp "${JUNIT_PATH}" -d "${OUTPUT_DIR}" $(find ${SRC_DIR} -name *.java)
java -ea -cp "${OUTPUT_DIR}:${JUNIT_PATH}" lanSimulation.LANSimulation t > /tmp/output.txt 2>&1
cat /tmp/output.txt
set +e
if grep -q -E '^FAILURES' /tmp/output.txt
then
	exit 1
fi
