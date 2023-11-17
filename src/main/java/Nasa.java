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
    public String getCopyright() {
        return copyright;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public String getMediaType() {
        return media_type;
    }

    public String getServiceVersion() {
        return service_version;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "NasaObject{" +
                "copyright='" + copyright + '\'' +
                ", date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", hdurl='" + hdurl + '\'' +
                ", mediaType='" + media_type + '\'' +
                ", serviceVersion='" + service_version + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}