const CACHE_NAME = 'rs-advogados-v1';
const ASSETS = [
  '/',
  'index.html',
  'sobre.html',
  'especialidades.html',
  'socios.html',
  'manifest.json',
  'assets/css/style.css',
  'assets/img/logo.png.png',
  'assets/img/Escritorio.png',
  'assets/img/Natália Soares.png',
  'assets/img/Agatha Ribeiro.png',
  'https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css'
];

self.addEventListener('install', (event) => {
  event.waitUntil(
    caches.open(CACHE_NAME).then((cache) => {
      return cache.addAll(ASSETS);
    })
  );
});

self.addEventListener('activate', (event) => {
  event.waitUntil(
    caches.keys().then((cacheNames) => {
      return Promise.all(
        cacheNames.map((cache) => {
          if (cache !== CACHE_NAME) {
            return caches.delete(cache);
          }
        })
      );
    })
  );
});

self.addEventListener('fetch', (event) => {
  event.respondWith(
    caches.match(event.request).then((response) => {
      return response || fetch(event.request);
    })
  );
});
