###Get sbt version###
```
sbt sbtVersion
```

## Interactive Mode ##
Prefixing any key with the command 'show' will show key's resulting value.  This is especially useful with taskKeys which do not output their resulting values by default

### show ###
```
show [key]
show compile
```

### inspect ###
The inspect command will provide information about any key.
```
inspect [key]
inspect compile
inspect dist
```

### projects ###
The projects command will show the projects in the build definition
```
projects
```

The project command will select a current project.  This is useful since commands will only run for the current project. 
```
project [projectname]
project foo
compile //only will compile project foo
```
