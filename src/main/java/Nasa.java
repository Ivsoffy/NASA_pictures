import com.fasterxml.jackson.annotation.JsonProperty;
public class Nasa {
    String date;
    String explanation;
    String hdurl;
    String media_type;
    String service_version;
    String title;
    String url;
    String copyright;

    public Nasa(@JsonProperty("date")String date, @JsonProperty("explanation")String explanation, @JsonProperty("hdurl")String hdurl, @JsonProperty("media_type")String media_type, @JsonProperty("service_version")String service_version, @JsonProperty("title")String title, @JsonProperty("url")String url, @JsonProperty("copyright")String copyright){
        this.date = date;
        this.explanation = explanation;
        this.media_type = media_type;
        this.url = url;
        this.hdurl = hdurl;
        this.title = title;
        this.service_version = service_version;
        this.copyright = copyright;
    }

}
