#!/bin/bash
javap -s build/classes/kotlin/jvm/main/godot/gdnative/NativeMethodsKt.class > ../../jni-bridge/src/main/resources/jni/externalSignatures
