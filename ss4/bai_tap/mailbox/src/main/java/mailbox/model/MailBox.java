package mailbox.model;

public class MailBox {
    private String languages;
    private String pageSize;
    private boolean spmasFillter;
    private String singnature;

    public MailBox() {
    }

    public MailBox(String languages, String pageSize, boolean spmasFillter, String singnature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spmasFillter = spmasFillter;
        this.singnature = singnature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpmasFillter() {
        return spmasFillter;
    }

    public void setSpmasFillter(boolean spmasFillter) {
        this.spmasFillter = spmasFillter;
    }

    public String getSingnature() {
        return singnature;
    }

    public void setSingnature(String singnature) {
        this.singnature = singnature;
    }

}
