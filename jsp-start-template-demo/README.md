# JSP Start Template Demo

내장 톰캣을 사용한 JSP 프로젝트 템플릿입니다.

## 프로젝트 개요

이 프로젝트는 별도의 톰캣 서버 설치 없이 내장 톰캣을 사용하여 JSP 애플리케이션을 실행할 수 있는 템플릿입니다.

## 실행 방법

### IntelliJ IDEA에서 실행

1. IntelliJ IDEA에서 프로젝트를 열기
2. `src/main/java/com/example/jsp/JspStartMain.java` 파일 열기
3. `main` 메서드 옆의 실행 버튼(▶️) 클릭 또는 `Ctrl+Shift+F10`
4. 또는 `main` 메서드에서 우클릭 → "Run 'JspStartMain.main()'" 선택

## 프로젝트 구조

```
jsp-start-template-demo/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── jsp/
│       │               └── JspStartMain.java  # 메인 클래스
│       └── webapp/                            # JSP 파일 위치
│           └── WEB-INF/                       # 웹 애플리케이션 설정 폴더
└── target/                                    # 컴파일된 클래스 파일
```

## 주요 특징

- **내장 톰캣**: 별도의 톰캣 서버 설치 불필요
- **Java 17**: 최신 Java 버전 지원
- **JSP 지원**: JSP 파일 작성 및 실행 가능
- **간편한 실행**: IDE에서 바로 실행 가능
- **Maven 빌드**: 표준 Maven 프로젝트 구조


## pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.example</groupId>
	<artifactId>jsp-start-template-demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>jsp-start-template-demo</name>
	<description>JSP Start Template Demo with Embedded Tomcat</description>

	<!-- 변수 설정 -->
	<properties>
		<java.version>17</java.version>
		<tomcat.version>10.1.15</tomcat.version>
	</properties>
	
	<dependencies>
		<!-- JSP 지원을 위한 의존성 -->
		<dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-core</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jasper</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jasper-el</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jsp-api</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <!-- servlet api -->
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>6.0.0</version>
        </dependency>
	</dependencies>

	<!-- 메이븐 빌드 설정 -->
	<build>
		<finalName>jsp-start-template-demo</finalName>
		<plugins>	
			<!-- Fat JAR 생성을 위한 Shade Plugin -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-shade-plugin</artifactId>
				<version>3.2.1</version>
				<executions>
					<execution>
						<phase>package</phase>
						<goals>
							<goal>shade</goal>
						</goals>
						<configuration>
							<transformers>
								<transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
									<mainClass>com.example.jsp.JspStartMain</mainClass>
								</transformer>
							</transformers>
						</configuration>
					</execution>
				</executions>
			</plugin>
			
			<!-- Maven Compiler Plugin -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.11.0</version>
				<configuration>
					<source>17</source>
					<target>17</target>
				</configuration>
			</plugin>
		</plugins>
	</build> 

</project>
```
