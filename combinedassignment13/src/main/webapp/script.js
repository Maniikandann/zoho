// script.js
const songListElement = document.getElementById('song-list');
const audioPlayer = document.getElementById('audio-player');
const audioSource = document.getElementById('audio-source');
const currentSongElement = document.getElementById('current-song');
const favoritesListElement = document.getElementById('favorites-list');
const playlistContainer = document.getElementById('playlist-container');

const songs = [
    { id: 1, title: 'Song 1', src: '/Assignment13/song/song1.mp3' },
    { id: 2, title: 'Song 2', src: '/Assignment13/song/song2.mp3' },
    { id: 3, title: 'Song 3', src: '/Assignment13/song/song3.mp3' }
];

const favorites = [];
const playlists = [];

// Load song list
function loadSongs() {
    songListElement.innerHTML = '';
    songs.forEach(song => {
        const songItem = document.createElement('li');
        songItem.textContent = song.title;
        songItem.addEventListener('click', () => playSong(song));
        
        const favButton = document.createElement('button');
        favButton.textContent = '★';
        favButton.addEventListener('click', (e) => {
            e.stopPropagation();
            toggleFavorite(song);
        });
        
        songItem.appendChild(favButton);
        songListElement.appendChild(songItem);
    });
}

// Play song
function playSong(song) {
    audioSource.src = song.src;
    audioPlayer.load();
    audioPlayer.play();
    currentSongElement.textContent = `Playing: ${song.title}`;
}

// Toggle favorite
function toggleFavorite(song) {
    const index = favorites.findIndex(fav => fav.id === song.id);
    if (index > -1) {
        favorites.splice(index, 1);
    } else {
        favorites.push(song);
    }
    loadFavorites();
}

// Load favorites
function loadFavorites() {
    favoritesListElement.innerHTML = '';
    favorites.forEach(song => {
        const songItem = document.createElement('li');
        songItem.textContent = song.title;
        favoritesListElement.appendChild(songItem);
    });
}

// Create playlist
document.getElementById('create-playlist').addEventListener('click', () => {
    const playlistName = prompt('Enter playlist name:');
    if (playlistName) {
        const playlist = { name: playlistName, songs: [] };
        playlists.push(playlist);
        loadPlaylists();
    }
});

// Load playlists
function loadPlaylists() {
    playlistContainer.innerHTML = '';
    playlists.forEach(playlist => {
        const playlistElement = document.createElement('div');
        playlistElement.textContent = playlist.name;
        playlistContainer.appendChild(playlistElement);
    });
}

// Initialize
loadSongs();
loadFavorites();
loadPlaylists();
