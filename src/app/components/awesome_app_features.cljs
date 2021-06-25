(ns app.components.awesome-app-features(:require
                                        [app.components.reused.text :refer [text]]))

(defn awesome-app-features []
  [:div {:class "container margTop"}
   [:div.row
    [:div {:class "col-md-6 order-md-2"}
     [text {:hdr "Awesome app features"
            :tx "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id
                            ligula porta felis euismod semper. Praesent commodo cursus magna, vel
                            scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."}]
     [:div {:class "row padChapter"}
      ]
     ]
    ]])


div className="container margTop">
                <div className="row">

                    <div className="col-md-6 order-md-2">
                        
                        <div className="row padChapter">
                            <div className="col-md-10 order-md-2">
                                <HeaderChapter
                                    title="Fast performance"
                                    text="Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis
                                    euismod
                                    semper. Praesent commodo cursus magna."
                                    align = "left"
                                    sizeHeader = "small"
                                    sizeChap = "small"
                                />
                            </div>
                            <div className="col-md-2 order-md-1">
                                <img className="img-fluid mx-auto" src="../pictures/icons/icon-1.png"/>
                            </div>
                        </div>
                        <div className="row padChapter">

                            <div className="col-md-10 order-md-2">
                                <HeaderChapter
                                    title="Fast performance"
                                    text="Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis
                                    euismod
                                    semper. Praesent commodo cursus magna."
                                    align = "left"
                                    sizeHeader = "small"
                                    sizeChap = "small"
                                />
                            </div>
                            <div className="col-md-2 order-md-1">
                                <img className="featurette-image img-fluid mx-auto" src="../pictures/icons/icon-2.png"/>
                            </div>
                        </div>

                        <div className="row padChapter">
                            <div className="col-md-10 order-md-2">
                                <HeaderChapter
                                    title="Fast performance"
                                    text="Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis
                                    euismod
                                    semper. Praesent commodo cursus magna."
                                    align = "left"
                                    sizeHeader = "small"
                                    sizeChap = "small"
                                />
                            </div>
                            <div className="col-md-2 order-md-1">
                                <img className="featurette-image img-fluid mx-auto" src="../pictures/icons/icon-3.png"/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-5 order-md-1">

                        <img className="featurette-image img-fluid mx-auto" alt="500x500"
                             src="../pictures/main/features-phone.png"/>
                    </div>
                </div>
            </div>