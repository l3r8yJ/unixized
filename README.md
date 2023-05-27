# Unixized
Just small Java library which allow you to not think about line separators of some files.

## How to use
I'll provide just small unit test

```java
final class README {
    public static void main(final String[] args) {
        final ResourceOf before = new ResourceOf("not-unix-file.txt");
        assertThat(
            "Text in windows format",
            new TextOf(before).asString(),
            containsString("\r")
        );
        final Unixized actual = new UnixizedOf(before);
        assertThat(
            "Unixized text",
            actual.asText().asString(),
            not(containsString("\r"))
        );
    }
}
```
## How to install
Maven:
```xml
<dependency>
    <groupId>ru.l3r8y</groupId>
    <artifactId>unixized</artifactId>
    <version><!--get-latest--></version>
</dependency>
```
## How to Contribute

Fork repository, make changes, send us a [pull request](https://www.yegor256.com/2014/04/15/github-guidelines.html).
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.
