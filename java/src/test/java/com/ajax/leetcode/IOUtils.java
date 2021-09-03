package com.ajax.leetcode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOUtils {
    public static String readFile(String path) {
        InputStream arrayStream = IOUtils.class.getResourceAsStream(path);
        String result;
        String newLine = System.getProperty("line.separator");
        assert arrayStream != null;
        try (Stream<String> lines = new BufferedReader(new InputStreamReader(arrayStream)).lines()) {
            result = lines.collect(Collectors.joining(newLine));
        }
        return result;
    }

    public static long[] readFileIntoLongArray(String path) {
        String fileString = readFile(path);
        Long[] list = Arrays.stream(fileString.split("\\s"))
            .map(Long::valueOf).toArray(Long[]::new);
        long[] array = new long[list.length];
        for (int i = 0; i < list.length; i++) {
            array[i] = list[i];
        }
        return array;
    }

    public static int[] readFileIntoIntArray(String path) {
        String fileString = readFile(path);
        Integer[] list = Arrays.stream(fileString.split("\\s"))
            .map(Integer::valueOf).toArray(Integer[]::new);
        int[] array = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            array[i] = list[i];
        }
        return array;
    }

    public static void saveIntArrayToFile(String path, int[] array) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        try (OutputStream stream = new FileOutputStream(file)) {
            for (int value : array) {
                stream.write((value + " ").getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
