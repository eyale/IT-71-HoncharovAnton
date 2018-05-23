package it71.honcharov.services;

import it71.honcharov.music.MusicStyles;
import it71.honcharov.music.Track;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

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

    Collections.sort(tracklist, Track.TrackDurationComparator);

    for (Track str : tracklist) {
      if (str.getStyle() != style) {
        System.out.println(str);
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

  public void burnOnDisc(String filename, List<Track> tracklist) throws IOException {
    System.out.println();
    FileWriter fileWriter = new FileWriter(filename);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.print(tracklist);
    printWriter.close();
    System.out.println("The tracks was burned on the disc");
  }
}
