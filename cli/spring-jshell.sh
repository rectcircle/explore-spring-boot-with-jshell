#!/usr/bin/env bash

set -e

NEED_COMPILE="0"
SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE:-"default"}
MODULE_NAME="explore-spring-boot-with-jshell"

while getopts ":cp:h" opt; do #不打印错误信息, -a -c需要参数 -b 不需要传参  
  case $opt in
    c)
      NEED_COMPILE="1"
      ;;
    p) 
      SPRING_PROFILES_ACTIVE=$OPTARG
      ;;
    h)
      echo "Usage: ./cli/spring-jshell -c -p <spring.profiles.active>"
      echo "    Flag:"
      echo "          -c 是否重新编译"
      echo "          -h 显示帮助"
      echo "    Option:"
      echo "          -p 指定 Spring 激活的配置名，例如 dev"
      exit 0
      ;;
    :)
      exit 1
      ;;
    ?)
      echo "Invalid option: -$OPTARG"
      exit 1
      ;;
  esac
done

echo "Parameter: "
echo NEED_COMPILE=$NEED_COMPILE
echo SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE
echo

if [ z"$NEED_COMPILE" = z"1" ]; then
    ./mvnw clean package -DskipTests
fi

BASE_JSH_PATH=$(pwd)/cli/jsh/base.jsh
MODULE_JSH_PATH=$(pwd)/cli/jsh/$MODULE_NAME.jsh

cd target

if [ ! -d "BOOT-INF" ]; then
    jar xf $MODULE_NAME-*.jar
fi

SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE CLASSPATH="BOOT-INF/classes:BOOT-INF/lib/*" jshell $BASE_JSH_PATH $MODULE_JSH_PATH
