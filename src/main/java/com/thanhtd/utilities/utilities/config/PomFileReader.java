package com.thanhtd.utilities.utilities.config;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

import java.io.FileReader;

public class PomFileReader {

    private PomFileReader() {
    }

    public static Model getModel() {
        try (FileReader reader = new FileReader("pom.xml")) {
            MavenXpp3Reader mavenReader = new MavenXpp3Reader();
            return mavenReader.read(reader);
        } catch (Exception e) {
            return null;
        }
    }

}
