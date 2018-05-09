package it71.honcharov.services;

import java.util.List;

import it71.honcharov.music.Track;
import it71.honcharov.music.MusicStyles;

public class MusicService {
  private static final String TOTAL_DURATION = "Total duration: ";
  private static final String MIN = " min";
  private Double duration = 0.0;


  public void getTracklist(List<Track> tracklist) {
    for (Track t : tracklist) {
      System.out.println(t.toString());
    }
    System.out.println();
  }

  public void getTotalDuration(List<Track> tracklist) {
    for (int i = 0; i < tracklist.size(); i++) {
      duration += tracklist.get(i).getDuration();
    }
    System.out.println(TOTAL_DURATION + duration + MIN);
    System.out.println();
  }

  public void sortingByStyle(List<Track> tracklist, MusicStyles style) {
    for (Track t : tracklist) {
      if (t.getStyle() == style) {
        System.out.println(t.toString());
      }
    }
    for (Track t : tracklist) {
      if (t.getStyle() != style) {
        System.out.println(t.toString());
      }
    }
    System.out.println();
  }

  public void findByRange(Double from, Double to, List<Track> tracklist) {
    for (int i = 0; i < tracklist.size(); i++) {
      if (tracklist.get(i).getDuration() >= from && tracklist.get(i).getDuration() <= to) {
        System.out.println(tracklist.get(i).toString());
      }
    }
  }
}
