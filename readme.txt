《Java EE开发的颠覆者：Spring Boot实战》

P18依赖注入
在Spring环境下，控制翻转(Inversion of Control-IOC)和依赖注入(dependency injection-DI)是等同的概念。控制翻转是通过依赖注入实现的。
依赖注入：容器负责创建对象和维护对象间的依赖关系，而不是通过对象本身负责自己的创建和解决自己的依赖。目的：解耦。
Spring IoC容器：负责创建Bean，并通过容器将功能类Bean注入到你需要的Bean中。

声明Bean的注解：
@Component
@Service：业务逻辑层(service)
@Respository：数据访问层(dao)
@Controller：展现层(MVC --> Spring MVC)

注入Bean的注解：
@Autowired：Spring提供的注解
@Inject：JSR-330提供
@Resource：JSR-250提供


@ComponentScan：详见 DiConfig 类
@Controller，@Service，@Repository注解，查看其源码，他们中有一个共同的注解@Component
@ComponentScan注解默认就会装配标识了@Controller，@Service，@Repository，@Component注解的类到spring容器中

