package com.qiyi.walle.parser.java;

import com.qiyi.walle.parser.java.base.JavaLexer;
import com.qiyi.walle.parser.java.base.JavaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class JavaParserDriverTest {
    @Test
    public void testParse() throws Exception {
        JavaParserDriver jpd = new JavaParserDriver();
        jpd.parse(Paths.get(""), JavaParser::expression);

        String source = "this.value=other.value;";

        JavaLexer lexer = new JavaLexer(CharStreams.fromString(source));
        TokenStream stream = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(stream);
        JavaParser.ExpressionContext context = parser.expression();
        System.out.println(context);
    }

}