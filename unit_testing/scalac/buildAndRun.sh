PATH=~/tools/scala-2.11.2/bin:$PATH
SCALA_HOME=/Users/bharris/tools/scala-2.11.2/

FILES=./*.scala

for f in $FILES
do

  echo "**** COMPILING $f ****"
  scalac -cp ~/tools/scalatest_2.11-2.2.1.jar $f

done

#for f in $FILES
#do

#  echo "**** RUNNING $f ****"
  #scala -cp ~/tools/scalatest_2.11-2.2.1.jar org.scalatest.run ${f%.*}
  scala -cp ~/tools/scalatest_2.11-2.2.1.jar org.scalatest.run ScalaLocationTest
#done
