package it71.honcharov.containers;

import java.util.ArrayList;
import java.util.List;

import it71.honcharov.services.MusicService;
import it71.honcharov.music.Track;

import static it71.honcharov.music.MusicStyles.*;

public class Disc {
  private List<Track> tracklist = new ArrayList<>();
  private MusicService service = new MusicService();

  public Disc() {
    tracklist.add(new Track("AC/DC - Highway to Hell", 3.26, ROCK));
    tracklist.add(new Track("Desiigner – Priice Tag", 1.50, RAP_AND_HIPHOP));
    tracklist.add(new Track("Skybar - Children (Miami Sunset Lounge Version)", 2.17, ELECTRONIC));
    tracklist.add(new Track("The Offspring – The Kids Aren't Alright", 2.59, PUNK));
    tracklist.add(new Track("Adele - Someone like you", 4.45, POP));
    tracklist.add(new Track("Nirvana - Smells Like Teen Spirit", 4.37, ALTERNATIVE));
    tracklist.add(new Track("HAMMERFALL - Any Means Necessary", 3.34, METAL));
    tracklist.add(new Track("Mozart - Requiem", 4.35, CLASSIC));

    service.getTracklist(tracklist);
    service.getTotalDuration(tracklist);
    service.sortingByStyle(tracklist, ROCK);
    service.findByRange(2.49, 3.03, tracklist);
    service.burnOnDisc();
  }
}
