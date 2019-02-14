# springboot_Dubbo
springboot整合dubbo

### 采坑
springboot的版本和springboot-dubbo的版本是需要统一起来的，因为高版本的springboot会不兼容低版本的springboot-dubbo，会导致报log4j包异常，并且导致在zookeepe中不能注册。
