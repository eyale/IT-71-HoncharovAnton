package it71.honcharov.music;

import java.util.Comparator;

public class Track {
  private String name;
  private Double duration;
  private MusicStyles style;

  public Track(String name, Double duration, MusicStyles style) {
    this.name = name;
    this.duration = duration;
    this.style = style;
  }

  public String getName() {
    return name;
  }

  public Double getDuration() {
    return duration;
  }

  public MusicStyles getStyle() {
    return style;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + ", Duration: " + getDuration() + ", Style: " + getStyle();
  }

  public static Comparator<Track> TrackDurationComparator = new Comparator<Track>() {

    public int compare(Track t1, Track t2) {
      Double Duration1 = t1.getDuration();
      Double Duration2 = t2.getDuration();

      return Duration1.compareTo(Duration2);
    }
  };
}
