package com.raywenderlich.android.movieapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/raywenderlich/android/movieapp/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;", "(Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;)V", "debouncePeriod", "", "movieLoadingStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/raywenderlich/android/movieapp/ui/movies/MovieLoadingState;", "getMovieLoadingStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "searchJob", "Lkotlinx/coroutines/Job;", "searchMoviesLiveData", "", "Lcom/raywenderlich/android/movieapp/framework/network/model/Movie;", "getSearchMoviesLiveData", "fetchMovieByQuery", "", "query", "", "fetchPopularMovies", "onCleared", "onFragmentReady", "onMovieClicked", "movie", "onSearchQuery", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> searchMoviesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState> movieLoadingStateLiveData = null;
    private long debouncePeriod = 500L;
    private kotlinx.coroutines.Job searchJob;
    private final com.raywenderlich.android.movieapp.framework.network.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> getSearchMoviesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState> getMovieLoadingStateLiveData() {
        return null;
    }
    
    public final void onFragmentReady() {
    }
    
    public final void onSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void fetchPopularMovies() {
    }
    
    private final void fetchMovieByQuery(java.lang.String query) {
    }
    
    public final void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.movieapp.framework.network.model.Movie movie) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.movieapp.framework.network.MovieRepository repository) {
        super();
    }
}