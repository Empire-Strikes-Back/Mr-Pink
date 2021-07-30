(ns movie-query.main
  (:require [movie-query.nrepl]
            [movie-query.impl]
            [movie-query.etl]
            [movie-query.query]
            [movie-query.psql]
   ;
            )
  ;
  )


(defn -dev  [& args]
  (movie-query.nrepl/-main)
  (tool.pedestal.server/run-dev)
  )

(defn -main  [& args]
  (movie-query.nrepl/-main)
  )

