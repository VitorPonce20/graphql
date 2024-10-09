package pojo;

public class AllFilmsPOJO {
    public String body = " \"query AllFilms {\n" +
            "    allFilms {\n" +
            "        totalCount\n" +
            "        edges {\n" +
            "            cursor\n" +
            "            node {\n" +
            "                title\n" +
            "                episodeID\n" +
            "                openingCrawl\n" +
            "                director\n" +
            "                producers\n" +
            "                releaseDate\n" +
            "                created\n" +
            "                edited\n" +
            "                id\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}↵↵\"";
}
