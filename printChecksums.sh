#!/bin/bash
# This is a script to print the checksums of the generated binaries.
# Run this after running the 'assemble' task.

actualCoreChecksum=($(shasum -a 256 core/build/outputs/aar/core-release.aar))
actualServiceChecksum=($(shasum -a 256 service/build/outputs/aar/service-release.aar))
actualRpcChecksum=($(shasum -a 256 rpc/build/libs/rpc.jar))
actualModelsChecksum=($(shasum -a 256 models/build/outputs/aar/models-release.aar))

echo "Core: $actualCoreChecksum"
echo "Service: $actualServiceChecksum"
echo "Rpc: $actualRpcChecksum"
echo "Models: $actualModelsChecksum"

exit 0