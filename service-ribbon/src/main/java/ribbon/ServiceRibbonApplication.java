package ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 消费服务器
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 向服务中心注册
public class ServiceRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}
	 
	@Bean // 程序的ioc注入一个bean: restTemplate
	@LoadBalanced //表明开启负载均衡
	RestTemplate restTempate() {
		return new RestTemplate();
	}
}
